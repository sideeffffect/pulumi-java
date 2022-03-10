// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MachineResponseIdentity {
    /**
     * The identity's principal id.
     * 
     */
    private final String principalId;
    /**
     * The identity's tenant id.
     * 
     */
    private final String tenantId;
    /**
     * The identity type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private MachineResponseIdentity(
        @OutputCustomType.Parameter("principalId") String principalId,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The identity's principal id.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The identity's tenant id.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The identity type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineResponseIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public MachineResponseIdentity build() {
            return new MachineResponseIdentity(principalId, tenantId, type);
        }
    }
}
