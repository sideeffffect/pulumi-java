// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class InstanceAttachmentArgs extends ResourceArgs {

    public static final InstanceAttachmentArgs Empty = new InstanceAttachmentArgs();

    /**
     * The resource ID of the environment.
     * 
     */
    @Import(name="environment", required=true)
    private Output<String> environment;

    /**
     * @return The resource ID of the environment.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }

    /**
     * The Apigee instance associated with the Apigee environment,
     * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The Apigee instance associated with the Apigee environment,
     * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    private InstanceAttachmentArgs() {}

    private InstanceAttachmentArgs(InstanceAttachmentArgs $) {
        this.environment = $.environment;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceAttachmentArgs $;

        public Builder() {
            $ = new InstanceAttachmentArgs();
        }

        public Builder(InstanceAttachmentArgs defaults) {
            $ = new InstanceAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment The resource ID of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The resource ID of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param instanceId The Apigee instance associated with the Apigee environment,
         * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The Apigee instance associated with the Apigee environment,
         * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public InstanceAttachmentArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
