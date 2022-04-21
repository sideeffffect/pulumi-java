// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class TypedErrorInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final TypedErrorInfoResponse Empty = new TypedErrorInfoResponse();

    @Import(name="info", required=true)
    private Object info;

    public Object info() {
        return this.info;
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private TypedErrorInfoResponse() {}

    private TypedErrorInfoResponse(TypedErrorInfoResponse $) {
        this.info = $.info;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypedErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypedErrorInfoResponse $;

        public Builder() {
            $ = new TypedErrorInfoResponse();
        }

        public Builder(TypedErrorInfoResponse defaults) {
            $ = new TypedErrorInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder info(Object info) {
            $.info = info;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public TypedErrorInfoResponse build() {
            $.info = Objects.requireNonNull($.info, "expected parameter 'info' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
