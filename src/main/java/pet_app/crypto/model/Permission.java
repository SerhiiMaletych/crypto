package pet_app.crypto.model;

public enum Permission {
    USER_RIGHTS("user_rights"),
    ADMIN_RIGHTS("admin_rights");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}