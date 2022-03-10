// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VMResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Bastion Shareable Link.
 * 
 */
public final class BastionShareableLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final BastionShareableLinkResponse Empty = new BastionShareableLinkResponse();

    /**
     * The unique Bastion Shareable Link to the virtual machine.
     * 
     */
    @InputImport(name="bsl", required=true)
      private final String bsl;

    public String getBsl() {
        return this.bsl;
    }

    /**
     * The time when the link was created.
     * 
     */
    @InputImport(name="createdAt", required=true)
      private final String createdAt;

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Optional field indicating the warning or error message related to the vm in case of partial failure.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * Reference of the virtual machine resource.
     * 
     */
    @InputImport(name="vm", required=true)
      private final VMResponse vm;

    public VMResponse getVm() {
        return this.vm;
    }

    public BastionShareableLinkResponse(
        String bsl,
        String createdAt,
        String message,
        VMResponse vm) {
        this.bsl = Objects.requireNonNull(bsl, "expected parameter 'bsl' to be non-null");
        this.createdAt = Objects.requireNonNull(createdAt, "expected parameter 'createdAt' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.vm = Objects.requireNonNull(vm, "expected parameter 'vm' to be non-null");
    }

    private BastionShareableLinkResponse() {
        this.bsl = null;
        this.createdAt = null;
        this.message = null;
        this.vm = null;
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
        }
        public BastionShareableLinkResponse build() {
            return new BastionShareableLinkResponse(bsl, createdAt, message, vm);
        }
    }
}
