// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RCranPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final RCranPackageArgs Empty = new RCranPackageArgs();

    /**
     * The package name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The package name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The repository name.
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    /**
     * @return The repository name.
     * 
     */
    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private RCranPackageArgs() {}

    private RCranPackageArgs(RCranPackageArgs $) {
        this.name = $.name;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RCranPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RCranPackageArgs $;

        public Builder() {
            $ = new RCranPackageArgs();
        }

        public Builder(RCranPackageArgs defaults) {
            $ = new RCranPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The package name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The package name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param repository The repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public RCranPackageArgs build() {
            return $;
        }
    }

}
