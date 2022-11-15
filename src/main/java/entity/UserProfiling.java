package entity;

public enum UserProfiling {
    ISTEROID("Isteroid"),
    EPILEPTOID("Epileptoid"),
    PARANOID("Paranoid"),
    EMOTIVE("Emotive"),
    SHIZOID("Shizoid"),
    HYPERTIM("Hypertim");

    private final String psychotype;

    UserProfiling(String psychotype) {
        this.psychotype= psychotype;
    }

    public String getPsychotype() {
        return psychotype;
    }
}
