// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SyslogDataSourceResponse {
    /**
     * The list of facility names.
     * 
     */
    private final @Nullable List<String> facilityNames;
    /**
     * The log levels to collect.
     * 
     */
    private final @Nullable List<String> logLevels;
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    private final @Nullable String name;
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    private final @Nullable List<String> streams;

    @OutputCustomType.Constructor
    private SyslogDataSourceResponse(
        @OutputCustomType.Parameter("facilityNames") @Nullable List<String> facilityNames,
        @OutputCustomType.Parameter("logLevels") @Nullable List<String> logLevels,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("streams") @Nullable List<String> streams) {
        this.facilityNames = facilityNames;
        this.logLevels = logLevels;
        this.name = name;
        this.streams = streams;
    }

    /**
     * The list of facility names.
     * 
    */
    public List<String> getFacilityNames() {
        return this.facilityNames == null ? List.of() : this.facilityNames;
    }
    /**
     * The log levels to collect.
     * 
    */
    public List<String> getLogLevels() {
        return this.logLevels == null ? List.of() : this.logLevels;
    }
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
    */
    public List<String> getStreams() {
        return this.streams == null ? List.of() : this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyslogDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> facilityNames;
        private @Nullable List<String> logLevels;
        private @Nullable String name;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(SyslogDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facilityNames = defaults.facilityNames;
    	      this.logLevels = defaults.logLevels;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        public Builder facilityNames(@Nullable List<String> facilityNames) {
            this.facilityNames = facilityNames;
            return this;
        }

        public Builder logLevels(@Nullable List<String> logLevels) {
            this.logLevels = logLevels;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder streams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }
        public SyslogDataSourceResponse build() {
            return new SyslogDataSourceResponse(facilityNames, logLevels, name, streams);
        }
    }
}
