// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListAccountSasResult {
    /**
     * The shared access signature access token.
     * 
     */
    private final String accountSasToken;

    @OutputCustomType.Constructor
    private ListAccountSasResult(@OutputCustomType.Parameter("accountSasToken") String accountSasToken) {
        this.accountSasToken = accountSasToken;
    }

    /**
     * The shared access signature access token.
     * 
    */
    public String getAccountSasToken() {
        return this.accountSasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountSasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountSasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountSasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountSasToken = defaults.accountSasToken;
        }

        public Builder accountSasToken(String accountSasToken) {
            this.accountSasToken = Objects.requireNonNull(accountSasToken);
            return this;
        }
        public ListAccountSasResult build() {
            return new ListAccountSasResult(accountSasToken);
        }
    }
}
