// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkerPoolNetworkConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerPoolNetworkConfigGetArgs Empty = new WorkerPoolNetworkConfigGetArgs();

    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to `WorkerPool.project_id` on the service producer network. Must be in the format `projects/{project}/global/networks/{network}`, where `{project}` is a project number, such as `12345`, and `{network}` is the name of a VPC network in the project. See (https://cloud.google.com/cloud-build/docs/custom-workers/set-up-custom-worker-pool-environment#understanding_the_network_configuration_options)
     * 
     */
    @Import(name="peeredNetwork", required=true)
    private Output<String> peeredNetwork;

    public Output<String> peeredNetwork() {
        return this.peeredNetwork;
    }

    private WorkerPoolNetworkConfigGetArgs() {}

    private WorkerPoolNetworkConfigGetArgs(WorkerPoolNetworkConfigGetArgs $) {
        this.peeredNetwork = $.peeredNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolNetworkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolNetworkConfigGetArgs $;

        public Builder() {
            $ = new WorkerPoolNetworkConfigGetArgs();
        }

        public Builder(WorkerPoolNetworkConfigGetArgs defaults) {
            $ = new WorkerPoolNetworkConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder peeredNetwork(Output<String> peeredNetwork) {
            $.peeredNetwork = peeredNetwork;
            return this;
        }

        public Builder peeredNetwork(String peeredNetwork) {
            return peeredNetwork(Output.of(peeredNetwork));
        }

        public WorkerPoolNetworkConfigGetArgs build() {
            $.peeredNetwork = Objects.requireNonNull($.peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
            return $;
        }
    }

}
