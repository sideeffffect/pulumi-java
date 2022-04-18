// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ProcessServerDetailsResponse {
    /**
     * The available memory.
     * 
     */
    private final Double availableMemoryInBytes;
    /**
     * The available disk space.
     * 
     */
    private final Double availableSpaceInBytes;
    /**
     * The free disk space percentage.
     * 
     */
    private final Double freeSpacePercentage;
    /**
     * The health of the process server.
     * 
     */
    private final String health;
    /**
     * The health errors.
     * 
     */
    private final List<HealthErrorResponse> healthErrors;
    /**
     * The historic health of the process server based on the health in last 24 hours.
     * 
     */
    private final String historicHealth;
    /**
     * The process server Id.
     * 
     */
    private final String id;
    /**
     * The last heartbeat received from the process server.
     * 
     */
    private final String lastHeartbeatUtc;
    /**
     * The memory usage percentage.
     * 
     */
    private final Double memoryUsagePercentage;
    /**
     * The process server name.
     * 
     */
    private final String name;
    /**
     * The processor usage percentage.
     * 
     */
    private final Double processorUsagePercentage;
    /**
     * The throughput in bytes.
     * 
     */
    private final Double throughputInBytes;
    /**
     * The uploading pending data in bytes.
     * 
     */
    private final Double throughputUploadPendingDataInBytes;
    /**
     * The total memory.
     * 
     */
    private final Double totalMemoryInBytes;
    /**
     * The total disk space.
     * 
     */
    private final Double totalSpaceInBytes;
    /**
     * The used memory.
     * 
     */
    private final Double usedMemoryInBytes;
    /**
     * The used disk space.
     * 
     */
    private final Double usedSpaceInBytes;
    /**
     * The process server version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ProcessServerDetailsResponse(
        @CustomType.Parameter("availableMemoryInBytes") Double availableMemoryInBytes,
        @CustomType.Parameter("availableSpaceInBytes") Double availableSpaceInBytes,
        @CustomType.Parameter("freeSpacePercentage") Double freeSpacePercentage,
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthErrors") List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("historicHealth") String historicHealth,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastHeartbeatUtc") String lastHeartbeatUtc,
        @CustomType.Parameter("memoryUsagePercentage") Double memoryUsagePercentage,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("processorUsagePercentage") Double processorUsagePercentage,
        @CustomType.Parameter("throughputInBytes") Double throughputInBytes,
        @CustomType.Parameter("throughputUploadPendingDataInBytes") Double throughputUploadPendingDataInBytes,
        @CustomType.Parameter("totalMemoryInBytes") Double totalMemoryInBytes,
        @CustomType.Parameter("totalSpaceInBytes") Double totalSpaceInBytes,
        @CustomType.Parameter("usedMemoryInBytes") Double usedMemoryInBytes,
        @CustomType.Parameter("usedSpaceInBytes") Double usedSpaceInBytes,
        @CustomType.Parameter("version") String version) {
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.freeSpacePercentage = freeSpacePercentage;
        this.health = health;
        this.healthErrors = healthErrors;
        this.historicHealth = historicHealth;
        this.id = id;
        this.lastHeartbeatUtc = lastHeartbeatUtc;
        this.memoryUsagePercentage = memoryUsagePercentage;
        this.name = name;
        this.processorUsagePercentage = processorUsagePercentage;
        this.throughputInBytes = throughputInBytes;
        this.throughputUploadPendingDataInBytes = throughputUploadPendingDataInBytes;
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.usedMemoryInBytes = usedMemoryInBytes;
        this.usedSpaceInBytes = usedSpaceInBytes;
        this.version = version;
    }

    /**
     * The available memory.
     * 
    */
    public Double availableMemoryInBytes() {
        return this.availableMemoryInBytes;
    }
    /**
     * The available disk space.
     * 
    */
    public Double availableSpaceInBytes() {
        return this.availableSpaceInBytes;
    }
    /**
     * The free disk space percentage.
     * 
    */
    public Double freeSpacePercentage() {
        return this.freeSpacePercentage;
    }
    /**
     * The health of the process server.
     * 
    */
    public String health() {
        return this.health;
    }
    /**
     * The health errors.
     * 
    */
    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }
    /**
     * The historic health of the process server based on the health in last 24 hours.
     * 
    */
    public String historicHealth() {
        return this.historicHealth;
    }
    /**
     * The process server Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The last heartbeat received from the process server.
     * 
    */
    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    /**
     * The memory usage percentage.
     * 
    */
    public Double memoryUsagePercentage() {
        return this.memoryUsagePercentage;
    }
    /**
     * The process server name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The processor usage percentage.
     * 
    */
    public Double processorUsagePercentage() {
        return this.processorUsagePercentage;
    }
    /**
     * The throughput in bytes.
     * 
    */
    public Double throughputInBytes() {
        return this.throughputInBytes;
    }
    /**
     * The uploading pending data in bytes.
     * 
    */
    public Double throughputUploadPendingDataInBytes() {
        return this.throughputUploadPendingDataInBytes;
    }
    /**
     * The total memory.
     * 
    */
    public Double totalMemoryInBytes() {
        return this.totalMemoryInBytes;
    }
    /**
     * The total disk space.
     * 
    */
    public Double totalSpaceInBytes() {
        return this.totalSpaceInBytes;
    }
    /**
     * The used memory.
     * 
    */
    public Double usedMemoryInBytes() {
        return this.usedMemoryInBytes;
    }
    /**
     * The used disk space.
     * 
    */
    public Double usedSpaceInBytes() {
        return this.usedSpaceInBytes;
    }
    /**
     * The process server version.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessServerDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double availableMemoryInBytes;
        private Double availableSpaceInBytes;
        private Double freeSpacePercentage;
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String historicHealth;
        private String id;
        private String lastHeartbeatUtc;
        private Double memoryUsagePercentage;
        private String name;
        private Double processorUsagePercentage;
        private Double throughputInBytes;
        private Double throughputUploadPendingDataInBytes;
        private Double totalMemoryInBytes;
        private Double totalSpaceInBytes;
        private Double usedMemoryInBytes;
        private Double usedSpaceInBytes;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessServerDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.freeSpacePercentage = defaults.freeSpacePercentage;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.historicHealth = defaults.historicHealth;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.memoryUsagePercentage = defaults.memoryUsagePercentage;
    	      this.name = defaults.name;
    	      this.processorUsagePercentage = defaults.processorUsagePercentage;
    	      this.throughputInBytes = defaults.throughputInBytes;
    	      this.throughputUploadPendingDataInBytes = defaults.throughputUploadPendingDataInBytes;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
    	      this.usedMemoryInBytes = defaults.usedMemoryInBytes;
    	      this.usedSpaceInBytes = defaults.usedSpaceInBytes;
    	      this.version = defaults.version;
        }

        public Builder availableMemoryInBytes(Double availableMemoryInBytes) {
            this.availableMemoryInBytes = Objects.requireNonNull(availableMemoryInBytes);
            return this;
        }
        public Builder availableSpaceInBytes(Double availableSpaceInBytes) {
            this.availableSpaceInBytes = Objects.requireNonNull(availableSpaceInBytes);
            return this;
        }
        public Builder freeSpacePercentage(Double freeSpacePercentage) {
            this.freeSpacePercentage = Objects.requireNonNull(freeSpacePercentage);
            return this;
        }
        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder historicHealth(String historicHealth) {
            this.historicHealth = Objects.requireNonNull(historicHealth);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }
        public Builder memoryUsagePercentage(Double memoryUsagePercentage) {
            this.memoryUsagePercentage = Objects.requireNonNull(memoryUsagePercentage);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder processorUsagePercentage(Double processorUsagePercentage) {
            this.processorUsagePercentage = Objects.requireNonNull(processorUsagePercentage);
            return this;
        }
        public Builder throughputInBytes(Double throughputInBytes) {
            this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
            return this;
        }
        public Builder throughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
            return this;
        }
        public Builder totalMemoryInBytes(Double totalMemoryInBytes) {
            this.totalMemoryInBytes = Objects.requireNonNull(totalMemoryInBytes);
            return this;
        }
        public Builder totalSpaceInBytes(Double totalSpaceInBytes) {
            this.totalSpaceInBytes = Objects.requireNonNull(totalSpaceInBytes);
            return this;
        }
        public Builder usedMemoryInBytes(Double usedMemoryInBytes) {
            this.usedMemoryInBytes = Objects.requireNonNull(usedMemoryInBytes);
            return this;
        }
        public Builder usedSpaceInBytes(Double usedSpaceInBytes) {
            this.usedSpaceInBytes = Objects.requireNonNull(usedSpaceInBytes);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ProcessServerDetailsResponse build() {
            return new ProcessServerDetailsResponse(availableMemoryInBytes, availableSpaceInBytes, freeSpacePercentage, health, healthErrors, historicHealth, id, lastHeartbeatUtc, memoryUsagePercentage, name, processorUsagePercentage, throughputInBytes, throughputUploadPendingDataInBytes, totalMemoryInBytes, totalSpaceInBytes, usedMemoryInBytes, usedSpaceInBytes, version);
        }
    }
}
