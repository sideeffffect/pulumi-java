// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobLoadTimePartitioning {
    /**
     * Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    private final @Nullable String expirationMs;
    /**
     * If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    private final @Nullable String field;
    /**
     * The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"expirationMs","field","type"})
    private JobLoadTimePartitioning(
        @Nullable String expirationMs,
        @Nullable String field,
        String type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.type = type;
    }

    /**
     * Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
    */
    public Optional<String> getExpirationMs() {
        return Optional.ofNullable(this.expirationMs);
    }
    /**
     * If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
    */
    public Optional<String> getField() {
        return Optional.ofNullable(this.field);
    }
    /**
     * The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadTimePartitioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expirationMs;
        private @Nullable String field;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobLoadTimePartitioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        public Builder setExpirationMs(@Nullable String expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JobLoadTimePartitioning build() {
            return new JobLoadTimePartitioning(expirationMs, field, type);
        }
    }
}
