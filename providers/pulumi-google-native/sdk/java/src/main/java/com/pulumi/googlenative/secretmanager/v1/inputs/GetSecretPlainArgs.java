// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretPlainArgs Empty = new GetSecretPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="secretId", required=true)
    private String secretId;

    public String secretId() {
        return this.secretId;
    }

    private GetSecretPlainArgs() {}

    private GetSecretPlainArgs(GetSecretPlainArgs $) {
        this.project = $.project;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretPlainArgs $;

        public Builder() {
            $ = new GetSecretPlainArgs();
        }

        public Builder(GetSecretPlainArgs defaults) {
            $ = new GetSecretPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        public GetSecretPlainArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
