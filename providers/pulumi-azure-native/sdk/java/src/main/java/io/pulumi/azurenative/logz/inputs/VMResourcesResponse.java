// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VM Resource Ids
 * 
 */
public final class VMResourcesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMResourcesResponse Empty = new VMResourcesResponse();

    /**
     * Version of the Logz agent installed on the VM.
     * 
     */
    @InputImport(name="agentVersion")
      private final @Nullable String agentVersion;

    public Optional<String> getAgentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    /**
     * Request of a list vm host update operation.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public VMResourcesResponse(
        @Nullable String agentVersion,
        @Nullable String id) {
        this.agentVersion = agentVersion;
        this.id = id;
    }

    private VMResourcesResponse() {
        this.agentVersion = null;
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(VMResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.id = defaults.id;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public VMResourcesResponse build() {
            return new VMResourcesResponse(agentVersion, id);
        }
    }
}
