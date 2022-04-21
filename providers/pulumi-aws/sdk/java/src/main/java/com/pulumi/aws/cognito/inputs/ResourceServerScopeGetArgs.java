// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourceServerScopeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerScopeGetArgs Empty = new ResourceServerScopeGetArgs();

    /**
     * The scope description.
     * 
     */
    @Import(name="scopeDescription", required=true)
    private Output<String> scopeDescription;

    public Output<String> scopeDescription() {
        return this.scopeDescription;
    }

    /**
     * The scope name.
     * 
     */
    @Import(name="scopeName", required=true)
    private Output<String> scopeName;

    public Output<String> scopeName() {
        return this.scopeName;
    }

    private ResourceServerScopeGetArgs() {}

    private ResourceServerScopeGetArgs(ResourceServerScopeGetArgs $) {
        this.scopeDescription = $.scopeDescription;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerScopeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerScopeGetArgs $;

        public Builder() {
            $ = new ResourceServerScopeGetArgs();
        }

        public Builder(ResourceServerScopeGetArgs defaults) {
            $ = new ResourceServerScopeGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder scopeDescription(Output<String> scopeDescription) {
            $.scopeDescription = scopeDescription;
            return this;
        }

        public Builder scopeDescription(String scopeDescription) {
            return scopeDescription(Output.of(scopeDescription));
        }

        public Builder scopeName(Output<String> scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        public Builder scopeName(String scopeName) {
            return scopeName(Output.of(scopeName));
        }

        public ResourceServerScopeGetArgs build() {
            $.scopeDescription = Objects.requireNonNull($.scopeDescription, "expected parameter 'scopeDescription' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}
