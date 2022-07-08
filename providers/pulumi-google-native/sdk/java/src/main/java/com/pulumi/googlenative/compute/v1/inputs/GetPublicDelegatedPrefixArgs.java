// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicDelegatedPrefixArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicDelegatedPrefixArgs Empty = new GetPublicDelegatedPrefixArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicDelegatedPrefix", required=true)
    private Output<String> publicDelegatedPrefix;

    public Output<String> publicDelegatedPrefix() {
        return this.publicDelegatedPrefix;
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private GetPublicDelegatedPrefixArgs() {}

    private GetPublicDelegatedPrefixArgs(GetPublicDelegatedPrefixArgs $) {
        this.project = $.project;
        this.publicDelegatedPrefix = $.publicDelegatedPrefix;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicDelegatedPrefixArgs $;

        public Builder() {
            $ = new GetPublicDelegatedPrefixArgs();
        }

        public Builder(GetPublicDelegatedPrefixArgs defaults) {
            $ = new GetPublicDelegatedPrefixArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder publicDelegatedPrefix(Output<String> publicDelegatedPrefix) {
            $.publicDelegatedPrefix = publicDelegatedPrefix;
            return this;
        }

        public Builder publicDelegatedPrefix(String publicDelegatedPrefix) {
            return publicDelegatedPrefix(Output.of(publicDelegatedPrefix));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetPublicDelegatedPrefixArgs build() {
            $.publicDelegatedPrefix = Objects.requireNonNull($.publicDelegatedPrefix, "expected parameter 'publicDelegatedPrefix' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
