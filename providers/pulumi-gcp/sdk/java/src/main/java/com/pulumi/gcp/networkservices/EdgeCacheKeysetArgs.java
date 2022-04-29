// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheKeysetArgs extends ResourceArgs {

    public static final EdgeCacheKeysetArgs Empty = new EdgeCacheKeysetArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the EdgeCache resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify at least one (1) key, and may have up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    @Import(name="publicKeys", required=true)
    private Output<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys;

    /**
     * @return An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify at least one (1) key, and may have up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    public Output<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys() {
        return this.publicKeys;
    }

    private EdgeCacheKeysetArgs() {}

    private EdgeCacheKeysetArgs(EdgeCacheKeysetArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.publicKeys = $.publicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheKeysetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheKeysetArgs $;

        public Builder() {
            $ = new EdgeCacheKeysetArgs();
        }

        public Builder(EdgeCacheKeysetArgs defaults) {
            $ = new EdgeCacheKeysetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Set of label tags associated with the EdgeCache resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Set of label tags associated with the EdgeCache resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
         * You must specify at least one (1) key, and may have up to three (3) keys.
         * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
         * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(Output<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys) {
            $.publicKeys = publicKeys;
            return this;
        }

        /**
         * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
         * You must specify at least one (1) key, and may have up to three (3) keys.
         * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
         * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(List<EdgeCacheKeysetPublicKeyArgs> publicKeys) {
            return publicKeys(Output.of(publicKeys));
        }

        /**
         * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
         * You must specify at least one (1) key, and may have up to three (3) keys.
         * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
         * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(EdgeCacheKeysetPublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }

        public EdgeCacheKeysetArgs build() {
            $.publicKeys = Objects.requireNonNull($.publicKeys, "expected parameter 'publicKeys' to be non-null");
            return $;
        }
    }

}
