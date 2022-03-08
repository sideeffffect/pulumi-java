// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListStorageAccountSASResult {
    /**
     * List SAS credentials of storage account.
     * 
     */
    private final String accountSasToken;

    @OutputCustomType.Constructor({"accountSasToken"})
    private ListStorageAccountSASResult(String accountSasToken) {
        this.accountSasToken = accountSasToken;
    }

    /**
     * List SAS credentials of storage account.
     * 
    */
    public String getAccountSasToken() {
        return this.accountSasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountSASResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountSasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountSASResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountSasToken = defaults.accountSasToken;
        }

        public Builder setAccountSasToken(String accountSasToken) {
            this.accountSasToken = Objects.requireNonNull(accountSasToken);
            return this;
        }
        public ListStorageAccountSASResult build() {
            return new ListStorageAccountSASResult(accountSasToken);
        }
    }
}
