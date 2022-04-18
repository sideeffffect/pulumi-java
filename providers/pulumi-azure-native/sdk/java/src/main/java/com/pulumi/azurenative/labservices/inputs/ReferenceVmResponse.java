// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.azurenative.labservices.inputs.VmStateDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of a Reference Vm
 * 
 */
public final class ReferenceVmResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReferenceVmResponse Empty = new ReferenceVmResponse();

    /**
     * The password of the virtual machine. This will be set to null in GET resource API
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * The username of the virtual machine
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String userName() {
        return this.userName;
    }

    /**
     * VM resource Id for the environment
     * 
     */
    @Import(name="vmResourceId", required=true)
      private final String vmResourceId;

    public String vmResourceId() {
        return this.vmResourceId;
    }

    /**
     * The state details for the reference virtual machine.
     * 
     */
    @Import(name="vmStateDetails", required=true)
      private final VmStateDetailsResponse vmStateDetails;

    public VmStateDetailsResponse vmStateDetails() {
        return this.vmStateDetails;
    }

    public ReferenceVmResponse(
        @Nullable String password,
        String userName,
        String vmResourceId,
        VmStateDetailsResponse vmStateDetails) {
        this.password = password;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
        this.vmResourceId = Objects.requireNonNull(vmResourceId, "expected parameter 'vmResourceId' to be non-null");
        this.vmStateDetails = Objects.requireNonNull(vmStateDetails, "expected parameter 'vmStateDetails' to be non-null");
    }

    private ReferenceVmResponse() {
        this.password = null;
        this.userName = null;
        this.vmResourceId = null;
        this.vmStateDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String userName;
        private String vmResourceId;
        private VmStateDetailsResponse vmStateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceVmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
    	      this.vmResourceId = defaults.vmResourceId;
    	      this.vmStateDetails = defaults.vmStateDetails;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder vmResourceId(String vmResourceId) {
            this.vmResourceId = Objects.requireNonNull(vmResourceId);
            return this;
        }
        public Builder vmStateDetails(VmStateDetailsResponse vmStateDetails) {
            this.vmStateDetails = Objects.requireNonNull(vmStateDetails);
            return this;
        }        public ReferenceVmResponse build() {
            return new ReferenceVmResponse(password, userName, vmResourceId, vmStateDetails);
        }
    }
}
