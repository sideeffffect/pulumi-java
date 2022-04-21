// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 schema reference.
 * 
 */
public final class X12SchemaReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12SchemaReferenceResponse Empty = new X12SchemaReferenceResponse();

    /**
     * The message id.
     * 
     */
    @Import(name="messageId", required=true)
    private String messageId;

    public String messageId() {
        return this.messageId;
    }

    /**
     * The schema name.
     * 
     */
    @Import(name="schemaName", required=true)
    private String schemaName;

    public String schemaName() {
        return this.schemaName;
    }

    /**
     * The schema version.
     * 
     */
    @Import(name="schemaVersion", required=true)
    private String schemaVersion;

    public String schemaVersion() {
        return this.schemaVersion;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId")
    private @Nullable String senderApplicationId;

    public Optional<String> senderApplicationId() {
        return Optional.ofNullable(this.senderApplicationId);
    }

    private X12SchemaReferenceResponse() {}

    private X12SchemaReferenceResponse(X12SchemaReferenceResponse $) {
        this.messageId = $.messageId;
        this.schemaName = $.schemaName;
        this.schemaVersion = $.schemaVersion;
        this.senderApplicationId = $.senderApplicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12SchemaReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12SchemaReferenceResponse $;

        public Builder() {
            $ = new X12SchemaReferenceResponse();
        }

        public Builder(X12SchemaReferenceResponse defaults) {
            $ = new X12SchemaReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder messageId(String messageId) {
            $.messageId = messageId;
            return this;
        }

        public Builder schemaName(String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder schemaVersion(String schemaVersion) {
            $.schemaVersion = schemaVersion;
            return this;
        }

        public Builder senderApplicationId(@Nullable String senderApplicationId) {
            $.senderApplicationId = senderApplicationId;
            return this;
        }

        public X12SchemaReferenceResponse build() {
            $.messageId = Objects.requireNonNull($.messageId, "expected parameter 'messageId' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            $.schemaVersion = Objects.requireNonNull($.schemaVersion, "expected parameter 'schemaVersion' to be non-null");
            return $;
        }
    }

}
