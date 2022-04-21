// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of sqlManagedInstance.
 * 
 */
public final class SqlManagedInstancePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlManagedInstancePropertiesResponse Empty = new SqlManagedInstancePropertiesResponse();

    /**
     * The instance admin user
     * 
     */
    @Import(name="admin")
    private @Nullable String admin;

    public Optional<String> admin() {
        return Optional.ofNullable(this.admin);
    }

    /**
     * Username and password for basic authentication.
     * 
     */
    @Import(name="basicLoginInformation")
    private @Nullable BasicLoginInformationResponse basicLoginInformation;

    public Optional<BasicLoginInformationResponse> basicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }

    /**
     * null
     * 
     */
    @Import(name="dataControllerId")
    private @Nullable String dataControllerId;

    public Optional<String> dataControllerId() {
        return Optional.ofNullable(this.dataControllerId);
    }

    /**
     * The instance end time
     * 
     */
    @Import(name="endTime")
    private @Nullable String endTime;

    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The raw kubernetes information
     * 
     */
    @Import(name="k8sRaw")
    private @Nullable Object k8sRaw;

    public Optional<Object> k8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="lastUploadedDate")
    private @Nullable String lastUploadedDate;

    public Optional<String> lastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }

    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The instance start time
     * 
     */
    @Import(name="startTime")
    private @Nullable String startTime;

    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private SqlManagedInstancePropertiesResponse() {}

    private SqlManagedInstancePropertiesResponse(SqlManagedInstancePropertiesResponse $) {
        this.admin = $.admin;
        this.basicLoginInformation = $.basicLoginInformation;
        this.dataControllerId = $.dataControllerId;
        this.endTime = $.endTime;
        this.k8sRaw = $.k8sRaw;
        this.lastUploadedDate = $.lastUploadedDate;
        this.provisioningState = $.provisioningState;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlManagedInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlManagedInstancePropertiesResponse $;

        public Builder() {
            $ = new SqlManagedInstancePropertiesResponse();
        }

        public Builder(SqlManagedInstancePropertiesResponse defaults) {
            $ = new SqlManagedInstancePropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder admin(@Nullable String admin) {
            $.admin = admin;
            return this;
        }

        public Builder basicLoginInformation(@Nullable BasicLoginInformationResponse basicLoginInformation) {
            $.basicLoginInformation = basicLoginInformation;
            return this;
        }

        public Builder dataControllerId(@Nullable String dataControllerId) {
            $.dataControllerId = dataControllerId;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder k8sRaw(@Nullable Object k8sRaw) {
            $.k8sRaw = k8sRaw;
            return this;
        }

        public Builder lastUploadedDate(@Nullable String lastUploadedDate) {
            $.lastUploadedDate = lastUploadedDate;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            $.startTime = startTime;
            return this;
        }

        public SqlManagedInstancePropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
