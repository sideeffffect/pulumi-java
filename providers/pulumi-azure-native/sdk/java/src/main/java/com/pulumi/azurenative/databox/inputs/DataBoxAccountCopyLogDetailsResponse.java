// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Copy log details for a storage account of a DataBox job
 * 
 */
public final class DataBoxAccountCopyLogDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataBoxAccountCopyLogDetailsResponse Empty = new DataBoxAccountCopyLogDetailsResponse();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Indicates the type of job details.
     * Expected value is &#39;DataBox&#39;.
     * 
     */
    @Import(name="copyLogDetailsType", required=true)
    private String copyLogDetailsType;

    public String copyLogDetailsType() {
        return this.copyLogDetailsType;
    }

    /**
     * Link for copy logs.
     * 
     */
    @Import(name="copyLogLink", required=true)
    private String copyLogLink;

    public String copyLogLink() {
        return this.copyLogLink;
    }

    /**
     * Link for copy verbose logs. This will be set only when LogCollectionLevel is set to Verbose.
     * 
     */
    @Import(name="copyVerboseLogLink", required=true)
    private String copyVerboseLogLink;

    public String copyVerboseLogLink() {
        return this.copyVerboseLogLink;
    }

    private DataBoxAccountCopyLogDetailsResponse() {}

    private DataBoxAccountCopyLogDetailsResponse(DataBoxAccountCopyLogDetailsResponse $) {
        this.accountName = $.accountName;
        this.copyLogDetailsType = $.copyLogDetailsType;
        this.copyLogLink = $.copyLogLink;
        this.copyVerboseLogLink = $.copyVerboseLogLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataBoxAccountCopyLogDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataBoxAccountCopyLogDetailsResponse $;

        public Builder() {
            $ = new DataBoxAccountCopyLogDetailsResponse();
        }

        public Builder(DataBoxAccountCopyLogDetailsResponse defaults) {
            $ = new DataBoxAccountCopyLogDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder copyLogDetailsType(String copyLogDetailsType) {
            $.copyLogDetailsType = copyLogDetailsType;
            return this;
        }

        public Builder copyLogLink(String copyLogLink) {
            $.copyLogLink = copyLogLink;
            return this;
        }

        public Builder copyVerboseLogLink(String copyVerboseLogLink) {
            $.copyVerboseLogLink = copyVerboseLogLink;
            return this;
        }

        public DataBoxAccountCopyLogDetailsResponse build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.copyLogDetailsType = Codegen.stringProp("copyLogDetailsType").arg($.copyLogDetailsType).require();
            $.copyLogLink = Objects.requireNonNull($.copyLogLink, "expected parameter 'copyLogLink' to be non-null");
            $.copyVerboseLogLink = Objects.requireNonNull($.copyVerboseLogLink, "expected parameter 'copyVerboseLogLink' to be non-null");
            return $;
        }
    }

}
