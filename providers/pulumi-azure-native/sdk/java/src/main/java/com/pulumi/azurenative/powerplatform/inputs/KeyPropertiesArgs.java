// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Url and version of the KeyVault Secret
 * 
 */
public final class KeyPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyPropertiesArgs Empty = new KeyPropertiesArgs();

    /**
     * The identifier of the key vault key used to encrypt data.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The version of the identity which will be used to access key vault.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private KeyPropertiesArgs() {}

    private KeyPropertiesArgs(KeyPropertiesArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyPropertiesArgs $;

        public Builder() {
            $ = new KeyPropertiesArgs();
        }

        public Builder(KeyPropertiesArgs defaults) {
            $ = new KeyPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public KeyPropertiesArgs build() {
            return $;
        }
    }

}
