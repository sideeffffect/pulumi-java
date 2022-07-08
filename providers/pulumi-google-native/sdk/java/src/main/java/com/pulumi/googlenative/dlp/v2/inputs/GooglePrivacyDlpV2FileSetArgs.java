// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2CloudStorageRegexFileSetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set of files to scan.
 * 
 */
public final class GooglePrivacyDlpV2FileSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2FileSetArgs Empty = new GooglePrivacyDlpV2FileSetArgs();

    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    @Import(name="regexFileSet")
    private @Nullable Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> regexFileSet;

    /**
     * @return The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs>> regexFileSet() {
        return Optional.ofNullable(this.regexFileSet);
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private GooglePrivacyDlpV2FileSetArgs() {}

    private GooglePrivacyDlpV2FileSetArgs(GooglePrivacyDlpV2FileSetArgs $) {
        this.regexFileSet = $.regexFileSet;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2FileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FileSetArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2FileSetArgs();
        }

        public Builder(GooglePrivacyDlpV2FileSetArgs defaults) {
            $ = new GooglePrivacyDlpV2FileSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regexFileSet The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
         * 
         * @return builder
         * 
         */
        public Builder regexFileSet(@Nullable Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> regexFileSet) {
            $.regexFileSet = regexFileSet;
            return this;
        }

        /**
         * @param regexFileSet The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
         * 
         * @return builder
         * 
         */
        public Builder regexFileSet(GooglePrivacyDlpV2CloudStorageRegexFileSetArgs regexFileSet) {
            return regexFileSet(Output.of(regexFileSet));
        }

        /**
         * @param url The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GooglePrivacyDlpV2FileSetArgs build() {
            return $;
        }
    }

}
