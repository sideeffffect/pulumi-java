// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a group of VMs that can be identified as having all these labels, for example "env=prod and app=web".
 * 
 */
public final class PatchInstanceFilterGroupLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchInstanceFilterGroupLabelArgs Empty = new PatchInstanceFilterGroupLabelArgs();

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    public PatchInstanceFilterGroupLabelArgs(@Nullable Output<Map<String,String>> labels) {
        this.labels = labels;
    }

    private PatchInstanceFilterGroupLabelArgs() {
        this.labels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchInstanceFilterGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchInstanceFilterGroupLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }        public PatchInstanceFilterGroupLabelArgs build() {
            return new PatchInstanceFilterGroupLabelArgs(labels);
        }
    }
}
