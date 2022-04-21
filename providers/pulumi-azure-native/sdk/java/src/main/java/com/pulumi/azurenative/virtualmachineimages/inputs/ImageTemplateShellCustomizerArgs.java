// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Runs a shell script during the customization phase (Linux). Corresponds to Packer shell provisioner. Exactly one of &#39;scriptUri&#39; or &#39;inline&#39; can be specified.
 * 
 */
public final class ImageTemplateShellCustomizerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageTemplateShellCustomizerArgs Empty = new ImageTemplateShellCustomizerArgs();

    /**
     * Array of shell commands to execute
     * 
     */
    @Import(name="inline")
    private @Nullable Output<List<String>> inline;

    public Optional<Output<List<String>>> inline() {
        return Optional.ofNullable(this.inline);
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * URI of the shell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    @Import(name="scriptUri")
    private @Nullable Output<String> scriptUri;

    public Optional<Output<String>> scriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }

    /**
     * SHA256 checksum of the shell script provided in the scriptUri field
     * 
     */
    @Import(name="sha256Checksum")
    private @Nullable Output<String> sha256Checksum;

    public Optional<Output<String>> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }

    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;Shell&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ImageTemplateShellCustomizerArgs() {}

    private ImageTemplateShellCustomizerArgs(ImageTemplateShellCustomizerArgs $) {
        this.inline = $.inline;
        this.name = $.name;
        this.scriptUri = $.scriptUri;
        this.sha256Checksum = $.sha256Checksum;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplateShellCustomizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplateShellCustomizerArgs $;

        public Builder() {
            $ = new ImageTemplateShellCustomizerArgs();
        }

        public Builder(ImageTemplateShellCustomizerArgs defaults) {
            $ = new ImageTemplateShellCustomizerArgs(Objects.requireNonNull(defaults));
        }

        public Builder inline(@Nullable Output<List<String>> inline) {
            $.inline = inline;
            return this;
        }

        public Builder inline(List<String> inline) {
            return inline(Output.of(inline));
        }

        public Builder inline(String... inline) {
            return inline(List.of(inline));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder scriptUri(@Nullable Output<String> scriptUri) {
            $.scriptUri = scriptUri;
            return this;
        }

        public Builder scriptUri(String scriptUri) {
            return scriptUri(Output.of(scriptUri));
        }

        public Builder sha256Checksum(@Nullable Output<String> sha256Checksum) {
            $.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder sha256Checksum(String sha256Checksum) {
            return sha256Checksum(Output.of(sha256Checksum));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ImageTemplateShellCustomizerArgs build() {
            $.sha256Checksum = Codegen.stringProp("sha256Checksum").output().arg($.sha256Checksum).def("").getNullable();
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
