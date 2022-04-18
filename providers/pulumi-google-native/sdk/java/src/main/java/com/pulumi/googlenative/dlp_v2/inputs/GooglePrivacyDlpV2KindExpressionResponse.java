// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A representation of a Datastore kind.
 * 
 */
public final class GooglePrivacyDlpV2KindExpressionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2KindExpressionResponse Empty = new GooglePrivacyDlpV2KindExpressionResponse();

    /**
     * The name of the kind.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public GooglePrivacyDlpV2KindExpressionResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GooglePrivacyDlpV2KindExpressionResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KindExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KindExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GooglePrivacyDlpV2KindExpressionResponse build() {
            return new GooglePrivacyDlpV2KindExpressionResponse(name);
        }
    }
}
