// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the machine learning workspace containing the experiment that is source for the web service.
 * 
 */
public final class MachineLearningWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineLearningWorkspaceArgs Empty = new MachineLearningWorkspaceArgs();

    /**
     * Specifies the workspace ID of the machine learning workspace associated with the web service
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private MachineLearningWorkspaceArgs() {}

    private MachineLearningWorkspaceArgs(MachineLearningWorkspaceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineLearningWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineLearningWorkspaceArgs $;

        public Builder() {
            $ = new MachineLearningWorkspaceArgs();
        }

        public Builder(MachineLearningWorkspaceArgs defaults) {
            $ = new MachineLearningWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public MachineLearningWorkspaceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
