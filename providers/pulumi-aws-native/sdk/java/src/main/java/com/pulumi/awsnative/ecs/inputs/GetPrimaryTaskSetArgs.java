// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrimaryTaskSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrimaryTaskSetArgs Empty = new GetPrimaryTaskSetArgs();

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private GetPrimaryTaskSetArgs() {}

    private GetPrimaryTaskSetArgs(GetPrimaryTaskSetArgs $) {
        this.cluster = $.cluster;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrimaryTaskSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrimaryTaskSetArgs $;

        public Builder() {
            $ = new GetPrimaryTaskSetArgs();
        }

        public Builder(GetPrimaryTaskSetArgs defaults) {
            $ = new GetPrimaryTaskSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param service The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public GetPrimaryTaskSetArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
