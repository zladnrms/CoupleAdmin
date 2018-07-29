package io.defy.www.coupleadmin.view

import android.Manifest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.defy.www.coupleadmin.R
import io.defy.www.coupleadmin.contract.PermissionContract
import io.defy.www.coupleadmin.presenter.PermissionPresenter
import kotlinx.android.synthetic.main.activity_permission.*
import android.content.Intent
import android.os.Build
import android.support.v4.app.ActivityCompat
import android.support.design.widget.Snackbar
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.util.Log


class PermissionActivity : AppCompatActivity(), PermissionContract.View {

    /* presenter */
    private var presenter: PermissionContract.Presenter? = null

    private var showPhone = true
    private var showGPS = true
    private var showStorage = true

    val PERMISSIONS_MULTIPLE_REQUEST = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        presenter = PermissionPresenter()
        presenter?.attachView(this)

        layoutPhoneCollapse.setOnClickListener {
            if (showPhone) {
                showPhone = false;
                ivPhone.setImageResource(R.drawable.ic_chevron_down);
                layoutPhoneDetail.setVisibility(View.GONE);
            } else {
                showPhone = true;
                ivPhone.setImageResource(R.drawable.ic_chevron_up);
                layoutPhoneDetail.setVisibility(View.VISIBLE);
            }
        }

        layoutStorageCollapse.setOnClickListener{
            if(showStorage) {
                showStorage = false;
                ivStorage.setImageResource(R.drawable.ic_chevron_down);
                layoutStorageDetail.setVisibility(View.GONE);
            } else {
                showStorage = true;
                ivStorage.setImageResource(R.drawable.ic_chevron_up);
                layoutStorageDetail.setVisibility(View.VISIBLE);
            }
        }

        layoutGpsCollapse.setOnClickListener{
            if(showGPS) {
                showGPS = false;
                ivGps.setImageResource(R.drawable.ic_chevron_down);
                layoutGpsDetail.setVisibility(View.GONE);
            } else {
                showGPS = true;
                ivGps.setImageResource(R.drawable.ic_chevron_up);
                layoutGpsDetail.setVisibility(View.VISIBLE);
            }
        }

        btnAccept.setOnClickListener{
            checkAndroidVersion()
        }
    }

    override fun onResume() {
        super.onResume()

        checkAndroidVersion()
    }

    private fun checkAndroidVersion() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkPermission()
        } else {
            val intent = Intent(this@PermissionActivity,  MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    /* Permission Check */
    private fun checkPermission() {
        if ((ContextCompat.checkSelfPermission(this@PermissionActivity, Manifest.permission.READ_EXTERNAL_STORAGE)
                        + ContextCompat.checkSelfPermission(this@PermissionActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        + ContextCompat.checkSelfPermission(this@PermissionActivity, Manifest.permission.READ_CALL_LOG)
                        + ContextCompat.checkSelfPermission(this@PermissionActivity, Manifest.permission.ACCESS_COARSE_LOCATION)
                        + ContextCompat.checkSelfPermission(this@PermissionActivity, Manifest.permission.ACCESS_FINE_LOCATION)) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this@PermissionActivity, Manifest.permission.READ_EXTERNAL_STORAGE)
                    || ActivityCompat.shouldShowRequestPermissionRationale(this@PermissionActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    || ActivityCompat.shouldShowRequestPermissionRationale(this@PermissionActivity, Manifest.permission.READ_CALL_LOG)
                    || ActivityCompat.shouldShowRequestPermissionRationale(this@PermissionActivity, Manifest.permission.ACCESS_COARSE_LOCATION)
                    || ActivityCompat.shouldShowRequestPermissionRationale(this@PermissionActivity, Manifest.permission.ACCESS_FINE_LOCATION)) {

                Snackbar.make(this@PermissionActivity.findViewById(android.R.id.content),
                        "커플 정보 공유의 원활한 진행을 위해 권한을 허용해주세요",
                        Snackbar.LENGTH_INDEFINITE).setAction("설정") { v ->
                    ActivityCompat.requestPermissions(this@PermissionActivity,
                            arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_CALL_LOG , Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION),
                            PERMISSIONS_MULTIPLE_REQUEST)

                }.show()
            } else {
                ActivityCompat.requestPermissions(this@PermissionActivity,
                        arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_CALL_LOG, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION),
                        PERMISSIONS_MULTIPLE_REQUEST)
            }
        } else {
            // if permission already granted
            val intent = Intent(this@PermissionActivity,  MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            PERMISSIONS_MULTIPLE_REQUEST -> if (grantResults.size > 0) {
                val readExternalFile = grantResults[0] == PackageManager.PERMISSION_GRANTED
                val writeExternalFile = grantResults[1] == PackageManager.PERMISSION_GRANTED
                val readCallPermission = grantResults[2] == PackageManager.PERMISSION_GRANTED
                val coapseLocationPermission = grantResults[3] == PackageManager.PERMISSION_GRANTED
                val fineLocationPermission = grantResults[4] == PackageManager.PERMISSION_GRANTED

                Log.d("d", "d : "+ readExternalFile + " , " + writeExternalFile + " , " + readCallPermission +  " , " + coapseLocationPermission + " , " + fineLocationPermission)

                if (readExternalFile && writeExternalFile && readCallPermission && coapseLocationPermission && fineLocationPermission) {
                    // if permission granted
                    val intent = Intent(this@PermissionActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Snackbar.make(this@PermissionActivity.findViewById(android.R.id.content),
                            "커플 정보 공유의 원활한 진행을 위해 권한을 허용해주세요",
                            Snackbar.LENGTH_INDEFINITE).setAction("설정"
                    ) { v ->
                        ActivityCompat.requestPermissions(this@PermissionActivity,
                                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_CALL_LOG , Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION),
                                PERMISSIONS_MULTIPLE_REQUEST)
                    }.show()
                }
            }
        }
    }

}
