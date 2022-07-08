// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalPublicDelegatedPrefixPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalPublicDelegatedPrefixPlainArgs Empty = new GetGlobalPublicDelegatedPrefixPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicDelegatedPrefix", required=true)
    private String publicDelegatedPrefix;

    public String publicDelegatedPrefix() {
        return this.publicDelegatedPrefix;
    }

    private GetGlobalPublicDelegatedPrefixPlainArgs() {}

    private GetGlobalPublicDelegatedPrefixPlainArgs(GetGlobalPublicDelegatedPrefixPlainArgs $) {
        this.project = $.project;
        this.publicDelegatedPrefix = $.publicDelegatedPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalPublicDelegatedPrefixPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalPublicDelegatedPrefixPlainArgs $;

        public Builder() {
            $ = new GetGlobalPublicDelegatedPrefixPlainArgs();
        }

        public Builder(GetGlobalPublicDelegatedPrefixPlainArgs defaults) {
            $ = new GetGlobalPublicDelegatedPrefixPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder publicDelegatedPrefix(String publicDelegatedPrefix) {
            $.publicDelegatedPrefix = publicDelegatedPrefix;
            return this;
        }

        public GetGlobalPublicDelegatedPrefixPlainArgs build() {
            $.publicDelegatedPrefix = Objects.requireNonNull($.publicDelegatedPrefix, "expected parameter 'publicDelegatedPrefix' to be non-null");
            return $;
        }
    }

}
