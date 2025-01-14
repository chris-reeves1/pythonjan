package Henums;

public enum UserRole {
    ADMIN,
    MODERATOR,
    USER,
    GUEST;


    public String getPermissions(){
        switch(this) {
            case ADMIN:
                return "Full access to everything";
            case MODERATOR:
                return "access to mod area";
            case USER:
                return "limited to read-only";
            case GUEST:
                return "No permissions!";
            default:
                return "No permissions!";
        }
    }
}
