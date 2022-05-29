export class SessionStorageManager {
  private static INSTANCE = new SessionStorageManager();
  static get instance() {
    return this.INSTANCE;
  }

  set(key: string, value: string) {
    sessionStorage.setItem(key, value);
  }

  get(key: string) {
    return sessionStorage.getItem(key);
  }

  remove(key: string) {
    sessionStorage.removeItem(key);
  }
}

export const sessionStorageManager = SessionStorageManager.instance;
