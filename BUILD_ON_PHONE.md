STOCKPRO — BUILD APK DARI HP

Cara paling mudah:
1. Buat akun GitHub.
2. Buat repository baru, misalnya: stockpro-offline.
3. Upload seluruh isi project ini ke repository tersebut (bukan folder luarnya).
4. Pastikan file .github/workflows/build-apk.yml ikut ter-upload.
5. Buka tab Actions.
6. Pilih "Build StockPro APK".
7. Tekan "Run workflow".
8. Setelah selesai, buka hasil workflow dan bagian Artifacts.
9. Download "StockPro-debug-apk.zip".
10. Ekstrak ZIP dan install app-debug.apk di HP.

Alternatif:
Project ini juga kompatibel dengan AndroidIDE karena menggunakan Android Gradle Plugin modern.

Catatan:
- APK debug bukan APK Play Store.
- Data aplikasi tersimpan lokal di HP.
- Backup data tersedia dari menu Backup.
