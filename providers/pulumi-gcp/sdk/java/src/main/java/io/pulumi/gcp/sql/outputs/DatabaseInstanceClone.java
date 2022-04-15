// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInstanceClone {
    /**
     * The timestamp of the point in time that should be restored.
     * 
     */
    private final @Nullable String pointInTime;
    /**
     * Name of the source instance which will be cloned.
     * 
     */
    private final String sourceInstanceName;

    @CustomType.Constructor
    private DatabaseInstanceClone(
        @CustomType.Parameter("pointInTime") @Nullable String pointInTime,
        @CustomType.Parameter("sourceInstanceName") String sourceInstanceName) {
        this.pointInTime = pointInTime;
        this.sourceInstanceName = sourceInstanceName;
    }

    /**
     * The timestamp of the point in time that should be restored.
     * 
    */
    public Optional<String> pointInTime() {
        return Optional.ofNullable(this.pointInTime);
    }
    /**
     * Name of the source instance which will be cloned.
     * 
    */
    public String sourceInstanceName() {
        return this.sourceInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceClone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pointInTime;
        private String sourceInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceClone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceInstanceName = defaults.sourceInstanceName;
        }

        public Builder pointInTime(@Nullable String pointInTime) {
            this.pointInTime = pointInTime;
            return this;
        }
        public Builder sourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
            return this;
        }        public DatabaseInstanceClone build() {
            return new DatabaseInstanceClone(pointInTime, sourceInstanceName);
        }
    }
}
