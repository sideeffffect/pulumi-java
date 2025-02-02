// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailoverGroupPartnerServer {
    /**
     * @return the SQL server ID
     * 
     */
    private final String id;
    /**
     * @return the location of the failover group.
     * 
     */
    private final @Nullable String location;
    /**
     * @return local replication role of the failover group instance.
     * 
     */
    private final @Nullable String role;

    @CustomType.Constructor
    private FailoverGroupPartnerServer(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("role") @Nullable String role) {
        this.id = id;
        this.location = location;
        this.role = role;
    }

    /**
     * @return the SQL server ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return the location of the failover group.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return local replication role of the failover group instance.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupPartnerServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupPartnerServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.role = defaults.role;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }        public FailoverGroupPartnerServer build() {
            return new FailoverGroupPartnerServer(id, location, role);
        }
    }
}
