// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.VMResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BastionShareableLinkResponse {
    /**
     * The unique Bastion Shareable Link to the virtual machine.
     * 
     */
    private final String bsl;
    /**
     * The time when the link was created.
     * 
     */
    private final String createdAt;
    /**
     * Optional field indicating the warning or error message related to the vm in case of partial failure.
     * 
     */
    private final String message;
    /**
     * Reference of the virtual machine resource.
     * 
     */
    private final VMResponse vm;

    @CustomType.Constructor
    private BastionShareableLinkResponse(
        @CustomType.Parameter("bsl") String bsl,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("vm") VMResponse vm) {
        this.bsl = bsl;
        this.createdAt = createdAt;
        this.message = message;
        this.vm = vm;
    }

    /**
     * The unique Bastion Shareable Link to the virtual machine.
     * 
    */
    public String bsl() {
        return this.bsl;
    }
    /**
     * The time when the link was created.
     * 
    */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * Optional field indicating the warning or error message related to the vm in case of partial failure.
     * 
    */
    public String message() {
        return this.message;
    }
    /**
     * Reference of the virtual machine resource.
     * 
    */
    public VMResponse vm() {
        return this.vm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionShareableLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bsl;
        private String createdAt;
        private String message;
        private VMResponse vm;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionShareableLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bsl = defaults.bsl;
    	      this.createdAt = defaults.createdAt;
    	      this.message = defaults.message;
    	      this.vm = defaults.vm;
        }

        public Builder bsl(String bsl) {
            this.bsl = Objects.requireNonNull(bsl);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder vm(VMResponse vm) {
            this.vm = Objects.requireNonNull(vm);
            return this;
        }        public BastionShareableLinkResponse build() {
            return new BastionShareableLinkResponse(bsl, createdAt, message, vm);
        }
    }
}
