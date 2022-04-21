// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of azure data lake store dataset.
 * 
 */
public final class AzureDataLakeStoreLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDataLakeStoreLocationResponse Empty = new AzureDataLakeStoreLocationResponse();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Object fileName;

    public Optional<Object> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
    private @Nullable Object folderPath;

    public Optional<Object> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is &#39;AzureDataLakeStoreLocation&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private AzureDataLakeStoreLocationResponse() {}

    private AzureDataLakeStoreLocationResponse(AzureDataLakeStoreLocationResponse $) {
        this.fileName = $.fileName;
        this.folderPath = $.folderPath;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDataLakeStoreLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDataLakeStoreLocationResponse $;

        public Builder() {
            $ = new AzureDataLakeStoreLocationResponse();
        }

        public Builder(AzureDataLakeStoreLocationResponse defaults) {
            $ = new AzureDataLakeStoreLocationResponse(Objects.requireNonNull(defaults));
        }

        public Builder fileName(@Nullable Object fileName) {
            $.fileName = fileName;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AzureDataLakeStoreLocationResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
