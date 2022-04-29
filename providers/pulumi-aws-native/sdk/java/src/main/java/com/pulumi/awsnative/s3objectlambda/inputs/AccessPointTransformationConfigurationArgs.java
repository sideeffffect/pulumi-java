// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration to define what content transformation will be applied on which S3 Action.
 * 
 */
public final class AccessPointTransformationConfigurationArgs extends ResourceArgs {

    public static final AccessPointTransformationConfigurationArgs Empty = new AccessPointTransformationConfigurationArgs();

    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    public Output<List<String>> actions() {
        return this.actions;
    }

    @Import(name="contentTransformation", required=true)
    private Output<Object> contentTransformation;

    public Output<Object> contentTransformation() {
        return this.contentTransformation;
    }

    private AccessPointTransformationConfigurationArgs() {}

    private AccessPointTransformationConfigurationArgs(AccessPointTransformationConfigurationArgs $) {
        this.actions = $.actions;
        this.contentTransformation = $.contentTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointTransformationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointTransformationConfigurationArgs $;

        public Builder() {
            $ = new AccessPointTransformationConfigurationArgs();
        }

        public Builder(AccessPointTransformationConfigurationArgs defaults) {
            $ = new AccessPointTransformationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public Builder contentTransformation(Output<Object> contentTransformation) {
            $.contentTransformation = contentTransformation;
            return this;
        }

        public Builder contentTransformation(Object contentTransformation) {
            return contentTransformation(Output.of(contentTransformation));
        }

        public AccessPointTransformationConfigurationArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.contentTransformation = Objects.requireNonNull($.contentTransformation, "expected parameter 'contentTransformation' to be non-null");
            return $;
        }
    }

}
