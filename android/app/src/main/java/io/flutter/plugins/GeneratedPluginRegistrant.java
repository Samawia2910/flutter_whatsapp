package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.androidintent.AndroidIntentPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin android_intent, io.flutter.plugins.androidintent.AndroidIntentPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.camera.CameraPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin camera, io.flutter.plugins.camera.CameraPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin contacts_service, flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin", e);
    }
    try {
      com.github.yasukotelin.ext_storage.ExtStoragePlugin.registerWith(shimPluginRegistry.registrarFor("com.github.yasukotelin.ext_storage.ExtStoragePlugin"));
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin ext_storage, com.github.yasukotelin.ext_storage.ExtStoragePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new fr.g123k.flutterappbadger.FlutterAppBadgerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_app_badger, fr.g123k.flutterappbadger.FlutterAppBadgerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.flutter.plugins.integration_test.IntegrationTestPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin integration_test, dev.flutter.plugins.integration_test.IntegrationTestPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin path_provider, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin shared_preferences, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
  }
}
