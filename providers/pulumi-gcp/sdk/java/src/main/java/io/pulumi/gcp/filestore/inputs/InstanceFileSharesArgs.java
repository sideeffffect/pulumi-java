// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.filestore.inputs.InstanceFileSharesNfsExportOptionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFileSharesArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFileSharesArgs Empty = new InstanceFileSharesArgs();

    /**
     * File share capacity in GiB. This must be at least 1024 GiB
     * for the standard tier, or 2560 GiB for the premium tier.
     * 
     */
    @InputImport(name="capacityGb", required=true)
      private final Input<Integer> capacityGb;

    public Input<Integer> getCapacityGb() {
        return this.capacityGb;
    }

    /**
     * The name of the fileshare (16 characters or less)
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Nfs Export Options. There is a limit of 10 export options per file share.
     * Structure is documented below.
     * 
     */
    @InputImport(name="nfsExportOptions")
      private final @Nullable Input<List<InstanceFileSharesNfsExportOptionArgs>> nfsExportOptions;

    public Input<List<InstanceFileSharesNfsExportOptionArgs>> getNfsExportOptions() {
        return this.nfsExportOptions == null ? Input.empty() : this.nfsExportOptions;
    }

    public InstanceFileSharesArgs(
        Input<Integer> capacityGb,
        Input<String> name,
        @Nullable Input<List<InstanceFileSharesNfsExportOptionArgs>> nfsExportOptions) {
        this.capacityGb = Objects.requireNonNull(capacityGb, "expected parameter 'capacityGb' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nfsExportOptions = nfsExportOptions;
    }

    private InstanceFileSharesArgs() {
        this.capacityGb = Input.empty();
        this.name = Input.empty();
        this.nfsExportOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFileSharesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> capacityGb;
        private Input<String> name;
        private @Nullable Input<List<InstanceFileSharesNfsExportOptionArgs>> nfsExportOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFileSharesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityGb = defaults.capacityGb;
    	      this.name = defaults.name;
    	      this.nfsExportOptions = defaults.nfsExportOptions;
        }

        public Builder capacityGb(Input<Integer> capacityGb) {
            this.capacityGb = Objects.requireNonNull(capacityGb);
            return this;
        }

        public Builder capacityGb(Integer capacityGb) {
            this.capacityGb = Input.of(Objects.requireNonNull(capacityGb));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder nfsExportOptions(@Nullable Input<List<InstanceFileSharesNfsExportOptionArgs>> nfsExportOptions) {
            this.nfsExportOptions = nfsExportOptions;
            return this;
        }

        public Builder nfsExportOptions(@Nullable List<InstanceFileSharesNfsExportOptionArgs> nfsExportOptions) {
            this.nfsExportOptions = Input.ofNullable(nfsExportOptions);
            return this;
        }
        public InstanceFileSharesArgs build() {
            return new InstanceFileSharesArgs(capacityGb, name, nfsExportOptions);
        }
    }
}
