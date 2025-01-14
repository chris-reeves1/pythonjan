package Henums;

public enum Level {
    LOW(1, "low severity"),
        MEDIUM(2, "medium severity"),
        HIGH(3, "high severity");

        private int severity;
        private String description;

        Level(int severity, String description) {
            this.severity = severity;
            this.description = description;
        }

        public int getSeverity() {
            return severity;
        }

        public String getDescription(){
            return description;
        }
    }
