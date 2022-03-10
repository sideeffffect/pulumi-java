// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FileServerWriteSettingsResponse {
    /**
     * The type of copy behavior for copy sink.
     * 
     */
    private final @Nullable Object copyBehavior;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The write setting type.
     * Expected value is 'FileServerWriteSettings'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private FileServerWriteSettingsResponse(
        @OutputCustomType.Parameter("copyBehavior") @Nullable Object copyBehavior,
        @OutputCustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @OutputCustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @OutputCustomType.Parameter("type") String type) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = type;
    }

    /**
     * The type of copy behavior for copy sink.
     * 
    */
    public Optional<Object> getCopyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The write setting type.
     * Expected value is 'FileServerWriteSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
        }

        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FileServerWriteSettingsResponse build() {
            return new FileServerWriteSettingsResponse(copyBehavior, disableMetricsCollection, maxConcurrentConnections, type);
        }
    }
}
