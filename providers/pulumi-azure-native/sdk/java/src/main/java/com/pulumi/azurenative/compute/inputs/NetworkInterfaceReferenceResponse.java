// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a network interface reference.
 * 
 */
public final class NetworkInterfaceReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceReferenceResponse Empty = new NetworkInterfaceReferenceResponse();

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
    private @Nullable String deleteOption;

    public Optional<String> deleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
    private @Nullable Boolean primary;

    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }

    private NetworkInterfaceReferenceResponse() {}

    private NetworkInterfaceReferenceResponse(NetworkInterfaceReferenceResponse $) {
        this.deleteOption = $.deleteOption;
        this.id = $.id;
        this.primary = $.primary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceReferenceResponse $;

        public Builder() {
            $ = new NetworkInterfaceReferenceResponse();
        }

        public Builder(NetworkInterfaceReferenceResponse defaults) {
            $ = new NetworkInterfaceReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder deleteOption(@Nullable String deleteOption) {
            $.deleteOption = deleteOption;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder primary(@Nullable Boolean primary) {
            $.primary = primary;
            return this;
        }

        public NetworkInterfaceReferenceResponse build() {
            return $;
        }
    }

}
