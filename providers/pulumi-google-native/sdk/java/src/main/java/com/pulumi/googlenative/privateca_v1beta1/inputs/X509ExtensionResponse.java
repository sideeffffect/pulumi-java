// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * An X509Extension specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
 * 
 */
public final class X509ExtensionResponse extends com.pulumi.resources.InvokeArgs {

    public static final X509ExtensionResponse Empty = new X509ExtensionResponse();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    @Import(name="critical", required=true)
    private Boolean critical;

    public Boolean critical() {
        return this.critical;
    }

    /**
     * The OID for this X.509 extension.
     * 
     */
    @Import(name="objectId", required=true)
    private ObjectIdResponse objectId;

    public ObjectIdResponse objectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private X509ExtensionResponse() {}

    private X509ExtensionResponse(X509ExtensionResponse $) {
        this.critical = $.critical;
        this.objectId = $.objectId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X509ExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X509ExtensionResponse $;

        public Builder() {
            $ = new X509ExtensionResponse();
        }

        public Builder(X509ExtensionResponse defaults) {
            $ = new X509ExtensionResponse(Objects.requireNonNull(defaults));
        }

        public Builder critical(Boolean critical) {
            $.critical = critical;
            return this;
        }

        public Builder objectId(ObjectIdResponse objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public X509ExtensionResponse build() {
            $.critical = Objects.requireNonNull($.critical, "expected parameter 'critical' to be non-null");
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
