# RONGMIRA Android starter

Package: `com.rongmira.shop`

## Setup
1. Open this folder in Android Studio.
2. Put your Firebase `google-services.json` file at `app/google-services.json`.
3. In Firebase Console > Authentication > Sign-in method, enable Email/Password.
4. Build and run on an Android device or emulator.

This is a starter project, not a finished production commerce system. The catalog is sample data stored locally. Before accepting real orders or payments, connect a trusted backend (for example Firebase Firestore + Cloud Functions), configure Firestore Security Rules, and implement verified payment-provider integration. Never store payment secrets in the Android app.

## Current starter features
- Customer email/password registration and login through Firebase Authentication
- Sample cosmetics and clothing catalog
- Local shopping cart
- Checkout form with Cash on Delivery or manual bKash/Nagad selection
- Order confirmation shown locally (not yet persisted to a backend)

Google sign-in, secure admin roles, online order storage, delivery tracking, and verified bKash/Nagad payment APIs are not implemented in this starter yet.
