// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of HDFS.
 * 
 */
public final class HdfsLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final HdfsLocationArgs Empty = new HdfsLocationArgs();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<Object> fileName;

    public Optional<Output<Object>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
    private @Nullable Output<Object> folderPath;

    public Optional<Output<Object>> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is &#39;HdfsLocation&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private HdfsLocationArgs() {}

    private HdfsLocationArgs(HdfsLocationArgs $) {
        this.fileName = $.fileName;
        this.folderPath = $.folderPath;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HdfsLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HdfsLocationArgs $;

        public Builder() {
            $ = new HdfsLocationArgs();
        }

        public Builder(HdfsLocationArgs defaults) {
            $ = new HdfsLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder fileName(@Nullable Output<Object> fileName) {
            $.fileName = fileName;
            return this;
        }

        public Builder fileName(Object fileName) {
            return fileName(Output.of(fileName));
        }

        public Builder folderPath(@Nullable Output<Object> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        public Builder folderPath(Object folderPath) {
            return folderPath(Output.of(folderPath));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public HdfsLocationArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
