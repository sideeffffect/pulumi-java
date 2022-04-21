// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RCranPackageResponse extends com.pulumi.resources.InvokeArgs {

    public static final RCranPackageResponse Empty = new RCranPackageResponse();

    /**
     * The package name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The repository name.
     * 
     */
    @Import(name="repository")
    private @Nullable String repository;

    public Optional<String> repository() {
        return Optional.ofNullable(this.repository);
    }

    private RCranPackageResponse() {}

    private RCranPackageResponse(RCranPackageResponse $) {
        this.name = $.name;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RCranPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RCranPackageResponse $;

        public Builder() {
            $ = new RCranPackageResponse();
        }

        public Builder(RCranPackageResponse defaults) {
            $ = new RCranPackageResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder repository(@Nullable String repository) {
            $.repository = repository;
            return this;
        }

        public RCranPackageResponse build() {
            return $;
        }
    }

}
