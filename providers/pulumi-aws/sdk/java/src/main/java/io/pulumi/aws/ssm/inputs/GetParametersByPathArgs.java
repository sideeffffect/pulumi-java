// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParametersByPathArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetParametersByPathArgs Empty = new GetParametersByPathArgs();

    /**
     * The prefix path of the parameter.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * Whether to recursively return parameters under `path`. Defaults to `false`.
     * 
     */
    @Import(name="recursive")
      private final @Nullable Boolean recursive;

    public Optional<Boolean> recursive() {
        return this.recursive == null ? Optional.empty() : Optional.ofNullable(this.recursive);
    }

    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    @Import(name="withDecryption")
      private final @Nullable Boolean withDecryption;

    public Optional<Boolean> withDecryption() {
        return this.withDecryption == null ? Optional.empty() : Optional.ofNullable(this.withDecryption);
    }

    public GetParametersByPathArgs(
        String path,
        @Nullable Boolean recursive,
        @Nullable Boolean withDecryption) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.recursive = recursive;
        this.withDecryption = withDecryption;
    }

    private GetParametersByPathArgs() {
        this.path = null;
        this.recursive = null;
        this.withDecryption = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParametersByPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private @Nullable Boolean recursive;
        private @Nullable Boolean withDecryption;

        public Builder() {
    	      // Empty
        }

        public Builder(GetParametersByPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.recursive = defaults.recursive;
    	      this.withDecryption = defaults.withDecryption;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder recursive(@Nullable Boolean recursive) {
            this.recursive = recursive;
            return this;
        }
        public Builder withDecryption(@Nullable Boolean withDecryption) {
            this.withDecryption = withDecryption;
            return this;
        }        public GetParametersByPathArgs build() {
            return new GetParametersByPathArgs(path, recursive, withDecryption);
        }
    }
}
