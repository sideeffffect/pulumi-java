// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration to define what content transformation will be applied on which S3 Action.
 * 
 */
public final class AccessPointTransformationConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final AccessPointTransformationConfiguration Empty = new AccessPointTransformationConfiguration();

    @Import(name="actions", required=true)
    private List<String> actions;

    public List<String> actions() {
        return this.actions;
    }

    @Import(name="contentTransformation", required=true)
    private Object contentTransformation;

    public Object contentTransformation() {
        return this.contentTransformation;
    }

    private AccessPointTransformationConfiguration() {}

    private AccessPointTransformationConfiguration(AccessPointTransformationConfiguration $) {
        this.actions = $.actions;
        this.contentTransformation = $.contentTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointTransformationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointTransformationConfiguration $;

        public Builder() {
            $ = new AccessPointTransformationConfiguration();
        }

        public Builder(AccessPointTransformationConfiguration defaults) {
            $ = new AccessPointTransformationConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder actions(List<String> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public Builder contentTransformation(Object contentTransformation) {
            $.contentTransformation = contentTransformation;
            return this;
        }

        public AccessPointTransformationConfiguration build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.contentTransformation = Objects.requireNonNull($.contentTransformation, "expected parameter 'contentTransformation' to be non-null");
            return $;
        }
    }

}
