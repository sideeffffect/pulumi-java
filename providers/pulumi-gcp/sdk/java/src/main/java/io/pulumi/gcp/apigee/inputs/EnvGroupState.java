// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvGroupState extends io.pulumi.resources.ResourceArgs {

    public static final EnvGroupState Empty = new EnvGroupState();

    /**
     * Hostnames of the environment group.
     * 
     */
    @InputImport(name="hostnames")
      private final @Nullable Input<List<String>> hostnames;

    public Input<List<String>> getHostnames() {
        return this.hostnames == null ? Input.empty() : this.hostnames;
    }

    /**
     * The resource ID of the environment group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Apigee Organization associated with the Apigee environment group,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    @InputImport(name="orgId")
      private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    public EnvGroupState(
        @Nullable Input<List<String>> hostnames,
        @Nullable Input<String> name,
        @Nullable Input<String> orgId) {
        this.hostnames = hostnames;
        this.name = name;
        this.orgId = orgId;
    }

    private EnvGroupState() {
        this.hostnames = Input.empty();
        this.name = Input.empty();
        this.orgId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> hostnames;
        private @Nullable Input<String> name;
        private @Nullable Input<String> orgId;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
        }

        public Builder hostnames(@Nullable Input<List<String>> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        public Builder hostnames(@Nullable List<String> hostnames) {
            this.hostnames = Input.ofNullable(hostnames);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder orgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder orgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }
        public EnvGroupState build() {
            return new EnvGroupState(hostnames, name, orgId);
        }
    }
}
