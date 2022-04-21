// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.KeyType;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListIntegrationAccountCallbackUrlArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountCallbackUrlArgs Empty = new ListIntegrationAccountCallbackUrlArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    public String integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key type.
     * 
     */
    @Import(name="keyType")
    private @Nullable Either<String,KeyType> keyType;

    public Optional<Either<String,KeyType>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The expiry time.
     * 
     */
    @Import(name="notAfter")
    private @Nullable String notAfter;

    public Optional<String> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListIntegrationAccountCallbackUrlArgs() {}

    private ListIntegrationAccountCallbackUrlArgs(ListIntegrationAccountCallbackUrlArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.keyType = $.keyType;
        this.notAfter = $.notAfter;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIntegrationAccountCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIntegrationAccountCallbackUrlArgs $;

        public Builder() {
            $ = new ListIntegrationAccountCallbackUrlArgs();
        }

        public Builder(ListIntegrationAccountCallbackUrlArgs defaults) {
            $ = new ListIntegrationAccountCallbackUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        public Builder keyType(@Nullable Either<String,KeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder notAfter(@Nullable String notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListIntegrationAccountCallbackUrlArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
