// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Process server details.
 * 
 */
public final class ProcessServerDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProcessServerDetailsResponse Empty = new ProcessServerDetailsResponse();

    /**
     * The available memory.
     * 
     */
    @Import(name="availableMemoryInBytes", required=true)
    private Double availableMemoryInBytes;

    public Double availableMemoryInBytes() {
        return this.availableMemoryInBytes;
    }

    /**
     * The available disk space.
     * 
     */
    @Import(name="availableSpaceInBytes", required=true)
    private Double availableSpaceInBytes;

    public Double availableSpaceInBytes() {
        return this.availableSpaceInBytes;
    }

    /**
     * The free disk space percentage.
     * 
     */
    @Import(name="freeSpacePercentage", required=true)
    private Double freeSpacePercentage;

    public Double freeSpacePercentage() {
        return this.freeSpacePercentage;
    }

    /**
     * The health of the process server.
     * 
     */
    @Import(name="health", required=true)
    private String health;

    public String health() {
        return this.health;
    }

    /**
     * The health errors.
     * 
     */
    @Import(name="healthErrors", required=true)
    private List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }

    /**
     * The historic health of the process server based on the health in last 24 hours.
     * 
     */
    @Import(name="historicHealth", required=true)
    private String historicHealth;

    public String historicHealth() {
        return this.historicHealth;
    }

    /**
     * The process server Id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * The last heartbeat received from the process server.
     * 
     */
    @Import(name="lastHeartbeatUtc", required=true)
    private String lastHeartbeatUtc;

    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * The memory usage percentage.
     * 
     */
    @Import(name="memoryUsagePercentage", required=true)
    private Double memoryUsagePercentage;

    public Double memoryUsagePercentage() {
        return this.memoryUsagePercentage;
    }

    /**
     * The process server name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The processor usage percentage.
     * 
     */
    @Import(name="processorUsagePercentage", required=true)
    private Double processorUsagePercentage;

    public Double processorUsagePercentage() {
        return this.processorUsagePercentage;
    }

    /**
     * The throughput in bytes.
     * 
     */
    @Import(name="throughputInBytes", required=true)
    private Double throughputInBytes;

    public Double throughputInBytes() {
        return this.throughputInBytes;
    }

    /**
     * The uploading pending data in bytes.
     * 
     */
    @Import(name="throughputUploadPendingDataInBytes", required=true)
    private Double throughputUploadPendingDataInBytes;

    public Double throughputUploadPendingDataInBytes() {
        return this.throughputUploadPendingDataInBytes;
    }

    /**
     * The total memory.
     * 
     */
    @Import(name="totalMemoryInBytes", required=true)
    private Double totalMemoryInBytes;

    public Double totalMemoryInBytes() {
        return this.totalMemoryInBytes;
    }

    /**
     * The total disk space.
     * 
     */
    @Import(name="totalSpaceInBytes", required=true)
    private Double totalSpaceInBytes;

    public Double totalSpaceInBytes() {
        return this.totalSpaceInBytes;
    }

    /**
     * The used memory.
     * 
     */
    @Import(name="usedMemoryInBytes", required=true)
    private Double usedMemoryInBytes;

    public Double usedMemoryInBytes() {
        return this.usedMemoryInBytes;
    }

    /**
     * The used disk space.
     * 
     */
    @Import(name="usedSpaceInBytes", required=true)
    private Double usedSpaceInBytes;

    public Double usedSpaceInBytes() {
        return this.usedSpaceInBytes;
    }

    /**
     * The process server version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private ProcessServerDetailsResponse() {}

    private ProcessServerDetailsResponse(ProcessServerDetailsResponse $) {
        this.availableMemoryInBytes = $.availableMemoryInBytes;
        this.availableSpaceInBytes = $.availableSpaceInBytes;
        this.freeSpacePercentage = $.freeSpacePercentage;
        this.health = $.health;
        this.healthErrors = $.healthErrors;
        this.historicHealth = $.historicHealth;
        this.id = $.id;
        this.lastHeartbeatUtc = $.lastHeartbeatUtc;
        this.memoryUsagePercentage = $.memoryUsagePercentage;
        this.name = $.name;
        this.processorUsagePercentage = $.processorUsagePercentage;
        this.throughputInBytes = $.throughputInBytes;
        this.throughputUploadPendingDataInBytes = $.throughputUploadPendingDataInBytes;
        this.totalMemoryInBytes = $.totalMemoryInBytes;
        this.totalSpaceInBytes = $.totalSpaceInBytes;
        this.usedMemoryInBytes = $.usedMemoryInBytes;
        this.usedSpaceInBytes = $.usedSpaceInBytes;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcessServerDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcessServerDetailsResponse $;

        public Builder() {
            $ = new ProcessServerDetailsResponse();
        }

        public Builder(ProcessServerDetailsResponse defaults) {
            $ = new ProcessServerDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder availableMemoryInBytes(Double availableMemoryInBytes) {
            $.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder availableSpaceInBytes(Double availableSpaceInBytes) {
            $.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder freeSpacePercentage(Double freeSpacePercentage) {
            $.freeSpacePercentage = freeSpacePercentage;
            return this;
        }

        public Builder health(String health) {
            $.health = health;
            return this;
        }

        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            $.healthErrors = healthErrors;
            return this;
        }

        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }

        public Builder historicHealth(String historicHealth) {
            $.historicHealth = historicHealth;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            $.lastHeartbeatUtc = lastHeartbeatUtc;
            return this;
        }

        public Builder memoryUsagePercentage(Double memoryUsagePercentage) {
            $.memoryUsagePercentage = memoryUsagePercentage;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder processorUsagePercentage(Double processorUsagePercentage) {
            $.processorUsagePercentage = processorUsagePercentage;
            return this;
        }

        public Builder throughputInBytes(Double throughputInBytes) {
            $.throughputInBytes = throughputInBytes;
            return this;
        }

        public Builder throughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            $.throughputUploadPendingDataInBytes = throughputUploadPendingDataInBytes;
            return this;
        }

        public Builder totalMemoryInBytes(Double totalMemoryInBytes) {
            $.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder totalSpaceInBytes(Double totalSpaceInBytes) {
            $.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder usedMemoryInBytes(Double usedMemoryInBytes) {
            $.usedMemoryInBytes = usedMemoryInBytes;
            return this;
        }

        public Builder usedSpaceInBytes(Double usedSpaceInBytes) {
            $.usedSpaceInBytes = usedSpaceInBytes;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public ProcessServerDetailsResponse build() {
            $.availableMemoryInBytes = Objects.requireNonNull($.availableMemoryInBytes, "expected parameter 'availableMemoryInBytes' to be non-null");
            $.availableSpaceInBytes = Objects.requireNonNull($.availableSpaceInBytes, "expected parameter 'availableSpaceInBytes' to be non-null");
            $.freeSpacePercentage = Objects.requireNonNull($.freeSpacePercentage, "expected parameter 'freeSpacePercentage' to be non-null");
            $.health = Objects.requireNonNull($.health, "expected parameter 'health' to be non-null");
            $.healthErrors = Objects.requireNonNull($.healthErrors, "expected parameter 'healthErrors' to be non-null");
            $.historicHealth = Objects.requireNonNull($.historicHealth, "expected parameter 'historicHealth' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.lastHeartbeatUtc = Objects.requireNonNull($.lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
            $.memoryUsagePercentage = Objects.requireNonNull($.memoryUsagePercentage, "expected parameter 'memoryUsagePercentage' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.processorUsagePercentage = Objects.requireNonNull($.processorUsagePercentage, "expected parameter 'processorUsagePercentage' to be non-null");
            $.throughputInBytes = Objects.requireNonNull($.throughputInBytes, "expected parameter 'throughputInBytes' to be non-null");
            $.throughputUploadPendingDataInBytes = Objects.requireNonNull($.throughputUploadPendingDataInBytes, "expected parameter 'throughputUploadPendingDataInBytes' to be non-null");
            $.totalMemoryInBytes = Objects.requireNonNull($.totalMemoryInBytes, "expected parameter 'totalMemoryInBytes' to be non-null");
            $.totalSpaceInBytes = Objects.requireNonNull($.totalSpaceInBytes, "expected parameter 'totalSpaceInBytes' to be non-null");
            $.usedMemoryInBytes = Objects.requireNonNull($.usedMemoryInBytes, "expected parameter 'usedMemoryInBytes' to be non-null");
            $.usedSpaceInBytes = Objects.requireNonNull($.usedSpaceInBytes, "expected parameter 'usedSpaceInBytes' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
