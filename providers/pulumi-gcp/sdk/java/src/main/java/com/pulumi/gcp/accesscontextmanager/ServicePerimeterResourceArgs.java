// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class ServicePerimeterResourceArgs extends ResourceArgs {

    public static final ServicePerimeterResourceArgs Empty = new ServicePerimeterResourceArgs();

    /**
     * The name of the Service Perimeter to add this resource to.
     * 
     */
    @Import(name="perimeterName", required=true)
    private Output<String> perimeterName;

    /**
     * @return The name of the Service Perimeter to add this resource to.
     * 
     */
    public Output<String> perimeterName() {
        return this.perimeterName;
    }

    /**
     * A GCP resource that is inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    /**
     * @return A GCP resource that is inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    private ServicePerimeterResourceArgs() {}

    private ServicePerimeterResourceArgs(ServicePerimeterResourceArgs $) {
        this.perimeterName = $.perimeterName;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterResourceArgs $;

        public Builder() {
            $ = new ServicePerimeterResourceArgs();
        }

        public Builder(ServicePerimeterResourceArgs defaults) {
            $ = new ServicePerimeterResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param perimeterName The name of the Service Perimeter to add this resource to.
         * 
         * @return builder
         * 
         */
        public Builder perimeterName(Output<String> perimeterName) {
            $.perimeterName = perimeterName;
            return this;
        }

        /**
         * @param perimeterName The name of the Service Perimeter to add this resource to.
         * 
         * @return builder
         * 
         */
        public Builder perimeterName(String perimeterName) {
            return perimeterName(Output.of(perimeterName));
        }

        /**
         * @param resource A GCP resource that is inside of the service perimeter.
         * Currently only projects are allowed.
         * Format: projects/{project_number}
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource A GCP resource that is inside of the service perimeter.
         * Currently only projects are allowed.
         * Format: projects/{project_number}
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public ServicePerimeterResourceArgs build() {
            $.perimeterName = Objects.requireNonNull($.perimeterName, "expected parameter 'perimeterName' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
